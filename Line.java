/*
From https://www.codewars.com/kata/vasya-clerk/java

Description:

The new "Avengers" movie has just been released! There are a lot of people at the cinema box office standing in a huge line. Each of them has a single 100, 50 or 25 dollars bill. A "Avengers" ticket costs 25 dollars.

Vasya is currently working as a clerk. He wants to sell a ticket to every single person in this line.

Can Vasya sell a ticket to each person and give the change if he initially has no money and sells the tickets strictly in the order people follow in the line?

Return YES, if Vasya can sell a ticket to each person and give the change. Otherwise return NO.

*/


public class Line {
  public static String Tickets(int[] peopleInLine) {

    int bill[] = new int[]{0,0}; // 25,50 bills register
    for (int c : peopleInLine) {
      switch(c) {
        case 25:
          bill[0]++;
          break;

        case 50:
          bill[1]++;
          if (bill[0] > 0)
            bill[0]--;
          else return "NO";
          break;

        case 100:
          if (bill[1] > 0 && bill[0] > 0) {
            bill[0]--;bill[1]--;
          }
          else if (bill[0] > 2) {
            bill[0]-=3;
          }
          else return "NO";
          break;
      }
    }
    return "YES";
  }
}
