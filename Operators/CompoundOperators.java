public class CompoundOperators {
    public static void main(String[] args) {
        int score = 100;
        
        score += 10;  // Same as: score = score + 10
        System.out.println("After += 10: " + score);  // 110
        
        score -= 20;  // Same as: score = score - 20
        System.out.println("After -= 20: " + score);  // 90
        
        score *= 2;   // Same as: score = score * 2
        System.out.println("After *= 2: " + score);   // 180
        
        score /= 3;   // Same as: score = score / 3
        System.out.println("After /= 3: " + score);   // 60
        
        score %= 7;   // Same as: score = score % 7
        System.out.println("After %= 7: " + score);   // 4 (remainder)
    }
}