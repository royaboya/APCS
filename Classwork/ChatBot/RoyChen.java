package Classwork.ChatBot;

/**
 * ChatBot Project, capable of simple logic based on well phrased string inputs
 */
public class RoyChen {
    private static String[] classes = { "no classes", "Spanish", "AP Physics 1", "AP Physics 1", "English",
            "AP US History",
            "AP Computer Science", "Lunch", "Honors Precalculus" };
    private static String[] questions = { "Hello, my name is Roy", "What is your name?", "How old are you?",
            "Where do you live?",
            "What class do you have in 3rd period?", "What's your favorite food?", "What is your favorite class? ", };
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
        return "Roy the boy is alive";
    }

    public String ask() {
        // return questions[0];
        return questions[(int) (Math.random() * questions.length)];
    }

    public String answer(String question) {
        String filter = question.trim().toLowerCase();

        if (filter.contains("hello") || filter.contains("hi") || filter.contains("my")) {
            return handleGreeting(filter);
        } else if (filter.contains("name") || filter.contains("you called")) {
            return "My name is  " + name;
        } else if (filter.contains("age") || filter.contains("old") || filter.contains("year")) {
            return "I am " + age + " years old";
        } else if (filter.contains("live") || filter.contains("from")) {
            return "I live in " + location;
        } else if (filter.contains("favorite")) {
            return handleFavorite(filter);
        } else if (filter.contains("period") || filter.contains("class")) {
            return handlePeriod(filter);
        } else if (filter.contains("+")) {
            return "operator"; // can expand on operators if needed
            // * - + / -4
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
     * edge cases, can you find them?
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
            // 6-8 we can just check the original words since they overlap
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

    public static String handleGreeting(String str) {
        String splice = "";

        if (str.contains("name is")) {
            // splice = str.substring(str.indexOf("is") + 2);
            // } else if (str.contains("i'm")) {
            // splice = str.substring(str.indexOf("i'm" + 2));
            // } else if (str.contains("i am")) {
            // splice = str.substring(str.indexOf("i am" + 3));
            // }

        }
        return "output = " + splice;
    }

    public static String handleOperator(String str) {
        return "to be done";
    }
}
