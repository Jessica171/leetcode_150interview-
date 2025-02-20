class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maxCandies = 0;

        // Find the maximum candies any kid currently has
        for (int candy : candies) {
            maxCandies = Math.max(maxCandies, candy);
        }

        // Check for each kid
        for (int candy : candies) {
            result.add(candy + extraCandies >= maxCandies);
        }

        return result;
        
    }
}