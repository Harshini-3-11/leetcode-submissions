class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>(Arrays.asList(1));

        for (int i = 1; i <= rowIndex; i++) {
            // Traverse from end to beginning to avoid overwriting values
            for (int j = i - 1; j >= 1; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
            row.add(1); // Add last element of each row as 1
        }

        return row;
    }
}