package SkillBuilders;

public class RandomNumbers {
    public static void main(String[] args) {
        int randNum;
        int sequenceLength = 0;

        do {
            randNum = (int)(Math.random() * 11); // generates 0–10
            System.out.print(randNum + " ");
            sequenceLength++;
        } while (randNum != 0);

        System.out.println("\nLength of sequence was: " + sequenceLength);
    }
}
