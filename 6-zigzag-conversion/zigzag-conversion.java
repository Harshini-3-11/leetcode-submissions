class Solution {
    public String convert(String s, int numRows) {

        if(numRows == 1 || s.length() <= numRows){
            return s;
        }

        StringBuilder[] rows = new StringBuilder[numRows];

        for(int i = 0; i < numRows; i++){
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;
        boolean down = true;

        for(char c : s.toCharArray()){

            rows[currentRow].append(c);

            if(currentRow == 0){
                down = true;
            }
            else if(currentRow == numRows - 1){
                down = false;
            }

            if(down){
                currentRow++;
            }
            else{
                currentRow--;
            }
        }

        StringBuilder result = new StringBuilder();

        for(StringBuilder r : rows){
            result.append(r);
        }

        return result.toString();
    }
}