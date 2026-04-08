import java.util.*;

class ChatBox {

    static Scanner sc = new Scanner(System.in);

    // Simple NLP processing (lowercase + remove punctuation)
    static String processInput(String input) {
        return input.toLowerCase().replaceAll("[^a-zA-Z0-9 ]", "");
    }

    // Rule-based response system
    static String getResponse(String input) {

        if (input.contains("hello") || input.contains("hi")) {
            return "Hello! 😊 How can I assist you today?";
        }

        else if (input.contains("how are you")) {
            return "I'm just a bot, but I'm doing great! 🚀";
        }

        else if (input.contains("your name")) {
            return "I am AI ChatBot 🤖";
        }

        else if (input.contains("course") || input.contains("study")) {
            return "I can help you with programming, AI, and projects!";
        }

        else if (input.contains("java")) {
            return "Java is a powerful OOP language used in many applications.";
        }

        else if (input.contains("bye") || input.contains("exit")) {
            return "Goodbye! 👋 Have a great day!";
        }

        else {
            return "🤔 I'm not sure about that. Can you ask something else?";
        }
    }

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("      🤖 AI CHATBOT SYSTEM 🤖");
        System.out.println("=====================================");
        System.out.println("Type 'exit' to end conversation\n");

        while (true) {
            System.out.print("You: ");
            String userInput = sc.nextLine();

            String processed = processInput(userInput);
            String response = getResponse(processed);

            System.out.println("Bot: " + response);

            if (processed.contains("exit") || processed.contains("bye")) {
                break;
            }
        }

        sc.close();
    }
}
