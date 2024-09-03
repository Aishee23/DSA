//https://leetcode.com/problems/minimum-insertions-to-balance-a-parentheses-string/description/

public int minInsertions(String s) {
    int insertions = 0;    // To track insertions needed
    int open = 0;          // To track unmatched '('

    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == '(') {
            open++;  // We need two ')' for every '('
        } else {
            // Case when we encounter a single ')'
            if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
                // If there's a pair of closing brackets
                if (open > 0) {
                    open--;  // One pair closes one '('
                } else {
                    insertions++;  // We need an extra '(' to match this closing
                }
                i++;  // Skip the next ')', since we already handled it
            } else {
                // We encounter a single ')' and not a pair
                if (open > 0) {
                    insertions++;  // We need one more ')' to close the current '('
                    open--;        // This ')' closes one '('
                } else {
                    // There's no '(' to close, so we need to insert one '(' before this
                    insertions += 2;  // One for the '(' and one more ')' needed
                }
            }
        }
    }

    // Any unmatched '(' will require two ')' each to balance
    insertions += 2 * open;

    return insertions;
}
