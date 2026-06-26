class Solution {
    public int distributeCandies(int[] candyType) {
        int maxCandiesAliceCanEat = candyType.length / 2;
        HashSet<Integer> uniqueCandies = new HashSet<>();
        for (int candy : candyType) {
            uniqueCandies.add(candy);
            if (uniqueCandies.size() >= maxCandiesAliceCanEat) {
                return maxCandiesAliceCanEat;
            }
        }
        return uniqueCandies.size();
    }
}
