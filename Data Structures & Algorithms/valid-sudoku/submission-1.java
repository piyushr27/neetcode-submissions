class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> rows = new HashMap<>();
        Map<Integer, Set<Character>> cols = new HashMap<>();
        Map<Integer, Set<Character>> squares = new HashMap<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') continue;

                int squareIndex = (i / 3) * 3 + (j / 3);

                rows.putIfAbsent(i, new HashSet<>());
                cols.putIfAbsent(j, new HashSet<>());
                squares.putIfAbsent(squareIndex, new HashSet<>());

                if (!rows.get(i).add(board[i][j]) ||
                    !cols.get(j).add(board[i][j]) ||
                    !squares.get(squareIndex).add(board[i][j])) {
                    return false;
                }
            }
        }
        return true;
    }
}
