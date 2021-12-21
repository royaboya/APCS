package Classwork.ChatBot;

import java.util.Scanner;

public class ChatBotSimpleTest {
    public static void main(String[] args) {
        String q = "";
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Chatbot test begins...");
        System.out.println();
        RoyChen bot = new RoyChen();

        System.out.println("Taking chatbot attendance...");
        System.out.println("Are you there?");
        System.out.println(bot.here());
        System.out.println();

        System.out.println("Testing Random Questions...");
        for (int i = 0; i < 5; i++) {
            q = bot.ask();
            System.out.println("Your question: " + q);
            System.out.println("Your answer: " + bot.answer(q));
        }

        System.out.println("Testing User Questions...");
        q = "";
        while (!q.equals("quit")) {
            System.out.print("Ask a question: ");
            q = keyboard.nextLine();
            System.out.println("Your answer: " + bot.answer(q));
        }
        keyboard.close();
    }
}