package Classwork.ChatBot;

/**
 * ChatBot Project, capable of simple logic based on well phrased string inputs
 * I'm sure there are much better approaches to this but I did this like last
 * minute
 */
public class RoyChen {
    private static String[] classes = { "no classes", "Spanish", "AP Physics 1", "AP Physics 1", "English",
            "AP US History",
            "AP Computer Science", "Lunch", "Honors Precalculus" };
    private static String[] questions = { "Hello, my name is Roy", "What is your name?", "How old are you?",
            "Where do you live?",
            "What class do you have in 3rd period?", "What's your favorite food?", "What is your favorite class? ",
            "What do you have after period 6?", "What is your favorite television show?",
            "What do you have before period 5?", "My name is Roy", "What do you have during seventh period?",
            "What are you called?", "How many years do you have?", "What do you have before period eigth?",
            "Where are my car keys?", "What is 10 +  6?", "What is 10.5 + 5?" };
    private static String[] favoriteThings = { "AP Computer Science", "sushi", "Rick and Morty", "blue", "volleyball" };
    private String name;
    private int age;
    private String location;

    public RoyChen() {
        name = "Roy";
        age = 16;
        location = "Queens, Flushing NY";
    }

    public String here() {
        return "Roy is alive";
    }

    public String ask() {
        return questions[(int) (Math.random() * questions.length)];
    }

    public String answer(String question) {
        String filter = question.trim().toLowerCase();

        if (hasGreeting(filter)) {
            return handleGreeting(filter);
        } else if (filter.contains("your") && filter.contains("name") || filter.contains("you called")) {
            return "My name is " + name;
        } else if (filter.contains("age") || filter.contains("old") || filter.contains("year")) {
            return "I am " + age + " years old";
        } else if (hasLocation(filter)) {
            return "I live in " + location;
        } else if (filter.contains("favorite")) {
            return handleFavorite(filter);
        } else if (filter.contains("period") || filter.contains("class")) {
            return handlePeriod(filter);
        } else if (hasOperator(filter)) {
            return handleOperator(filter);
        }
        return "I'm not sure how to answer that right now";
    }

    public static String handleFavorite(String str) {
        if (str.contains("period") || str.contains("class")) {
            return "My favorite class is " + favoriteThings[0];
        } else if (str.contains("food") || str.contains("meal") || str.contains("nourish")) {
            return "My favorite food is " + favoriteThings[1];
        } else if (str.contains("tv") || str.contains("television") || str.contains("show")) {
            return "I like watching " + favoriteThings[2] + " (I don't actually watch TV)";
        } else if (str.contains("color")) {
            return "My favorite color is " + favoriteThings[3];
        } else if (str.contains("sport") || str.contains("physical")) {
            return "I don't play sports but I think " + favoriteThings[4] + " is cool";
        }
        return "I'm haven't thought about that yet.";
    }

    /**
     * handlePeriod() is based on a monday schedule and is a super scuffed method
     * with last minute decisions put into place, prepare to have your eyes burned.
     * It works most of the time given a proper input but there are some minor
     * edge cases
     */
    public static String handlePeriod(String str) {
        char[] chars = str.toCharArray();
        int periodNumber = 0;
        boolean hasNumber = false;
        StringBuilder builder = new StringBuilder();

        if (str.contains("after")) {
            periodNumber += 1;
        } else if (str.contains("before")) {
            periodNumber -= 1;
        }

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(chars[i])) {
                builder.append(chars[i]);
                hasNumber = true;
            }
        }
        if (builder.length() != 0) {
            periodNumber += Integer.parseInt(builder.toString());
        }
        if (hasNumber) {
            if (periodNumber < 1 || periodNumber > 8) {
                return "I don't have class during that period / choose a valid period from 1-8 / choose a valid phrase";
            }
            return String.format("I have %1$s during period %2$s", classes[periodNumber], periodNumber);
        }
        // could've done something involving a check with "rd" or "th" but i dont wanna
        // refactor this
        if (str.contains("first") || str.contains("one")) {
            periodNumber += 1;
        } else if (str.contains("second") || str.contains("two")) {
            periodNumber += 2;
        } else if (str.contains("third") || str.contains("three")) {
            periodNumber += 3;
        } else if (str.contains("fourth") || str.contains("four")) {
            periodNumber += 4;
        } else if (str.contains("fifth") || str.contains("five")) {
            periodNumber += 5;
        } else if (str.contains("six")) {
            // 6-8 check the original words since they overlap
            periodNumber += 6;
        } else if (str.contains("seven")) {
            periodNumber += 7;
        } else if (str.contains("eight") || str.contains("last")) {
            periodNumber += 8;
        }
        if (periodNumber < 1 || periodNumber > 8) {
            /**
             * last minute decision to handle a few cases, it's also repetitive code but i'm
             * too lazy to refactor
             */
            return "I don't have class during that period / choose a valid period from 1-8 / choose a valid phrase";
        }
        return String.format("I have %1$s during period %2$s", classes[periodNumber], periodNumber);
    }

    /**
     * Horrible approach, only works well with good inputs and everything here is
     * hard coded. It also does not capitalize the names and has some attributes of
     * a dad. If you run a valid string, you'll see
     */
    public static String handleGreeting(String str) {
        int idx = 0;
        String s = "";
        if (str.contains("i am") || str.contains("i'm") || str.contains("my name is") || str.contains("im")) {
            if (str.contains("i am")) {
                idx = str.indexOf("i am") + 4;
            } else if (str.contains("i'm")) {
                idx = str.indexOf("i'm") + 3;
            } else if (str.contains("my name is")) {
                idx = str.indexOf("my name is") + 10;
            } else if (str.contains("im")) {
                idx = str.indexOf("im") + 2;
            }
            s = str.substring(idx).trim();
        }

        return "Hello " + s + " nice to meet you ";
    }

    /** Assumes the input expression isn't garbage. */
    public static String handleOperator(String str) {
        int i = (str.indexOf("+") + str.indexOf("-") + str.indexOf("*") + str.indexOf("/") + 3);
        if (i >= str.length()) {
            return "I don't know man";
        }
        char c = str.charAt(i);
        String left = str.substring(0, i).trim();
        String right = str.substring(i + 1).trim();
        char[] charLeft = left.toCharArray();
        char[] charRight = right.toCharArray();

        StringBuilder leftBuilder = new StringBuilder();
        StringBuilder rightBuilder = new StringBuilder();

        // I should've made a method for this
        for (int idx = 0; idx < charLeft.length; idx++) {
            if (Character.isDigit(charLeft[idx]) || charLeft[idx] == '.') {
                leftBuilder.append(charLeft[idx]);
            }
        }

        for (int idx = 0; idx < charRight.length; idx++) {
            if (Character.isDigit(charRight[idx]) || charRight[idx] == '.') {
                rightBuilder.append(charRight[idx]);
            }
        }

        double leftValue = Double.parseDouble(leftBuilder.toString());
        double rightValue = Double.parseDouble(rightBuilder.toString());

        switch (c) {
            case '+':
                return String.format("%1$s %2$s %3$s = %4$s", leftValue, c, rightValue, leftValue + rightValue);
            case '-':
                return String.format("%1$s %2$s %3$s = %4$s", leftValue, c, rightValue, leftValue - rightValue);
            case '*':
                return String.format("%1$s %2$s %3$s = %4$s", leftValue, c, rightValue, leftValue * rightValue);
            case '/':
                return String.format("%1$s %2$s %3$s = %4$s", leftValue, c, rightValue, leftValue / rightValue);
        }
        return "";
    }

    public static boolean hasOperator(String str) {
        return str.contains("+") || str.contains("-") || str.contains("*") || str.contains("/");
    }

    public static boolean hasGreeting(String str) {
        return str.contains("hi ") || str.contains("hello") || str.contains("greetings") || str.contains("my name");
    }

    public static boolean hasLocation(String str) {
        return str.contains("live") || str.contains("from") || str.contains("house")
                || str.contains("apartment") || str.contains("building");
    }
}