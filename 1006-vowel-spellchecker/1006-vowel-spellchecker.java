import java.util.*;

class Solution {
    public String[] spellchecker(String[] wordlist, String[] queries) {
        Set<String> exactWords = new HashSet<>();
        Map<String, String> caseInsensitiveMap = new HashMap<>();
        Map<String, String> vowelErrorMap = new HashMap<>();

        for (String word : wordlist) {
            exactWords.add(word);

            String lower = word.toLowerCase();
            caseInsensitiveMap.putIfAbsent(lower, word);

            String devowel = devowel(lower);
            vowelErrorMap.putIfAbsent(devowel, word);
        }

        String[] result = new String[queries.length];
        for (int i = 0; i < queries.length; i++) {
            String query = queries[i];
            if (exactWords.contains(query)) {
                result[i] = query;
            } else {
                String lower = query.toLowerCase();
                if (caseInsensitiveMap.containsKey(lower)) {
                    result[i] = caseInsensitiveMap.get(lower);
                } else {
                    String devowel = devowel(lower);
                    result[i] = vowelErrorMap.getOrDefault(devowel, "");
                }
            }
        }
        return result;
    }

    private String devowel(String word) {
        StringBuilder sb = new StringBuilder();
        for (char c : word.toCharArray()) {
            if ("aeiou".indexOf(c) >= 0) {
                sb.append('*'); // replace vowels with *
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
