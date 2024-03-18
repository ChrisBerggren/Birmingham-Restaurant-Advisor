import java.util.Scanner;

public class RestaurantAdvisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for preferences
        System.out.println("Welcome to the Birmingham Restaurant Advisor!");
        System.out.println("Please answer a few questions to help us suggest a restaurant for you.");

        System.out.print("What type of cuisine are you in the mood for? (Mexican, Italian, Fast Food, BBQ, Breakfast, Sandwiches): ");
        String cuisineType = scanner.nextLine();

        System.out.print("How much money are you willing to spend? (low, medium, high): ");
        String budget = scanner.nextLine();

        // Display suggestions based on user preferences
        System.out.println("\nBased on your preferences, here are some restaurant options for you:");

        switch (cuisineType.toLowerCase()) {
            case "mexican":
                System.out.println(getMexicanRestaurant(budget));
                break;
            case "italian":
                System.out.println(getItalianRestaurant(budget));
                break;
            case "fast food":
                System.out.println(getFastFoodRestaurant(budget));
                break;
            case "bbq":
                System.out.println(getBBQRestaurant(budget));
                break;
            case "breakfast":
                System.out.println(getBreakfastRestaurant(budget));
                break;
            case "sandwiches":
                System.out.println(getSandwichesRestaurant(budget));
                break;
            default:
                System.out.println("Sorry, we couldn't find suitable options based on your preferences.");
        }

        scanner.close();
    }

    // Method to suggest Mexican restaurants based on budget
    public static String getMexicanRestaurant(String budget) {
        if (budget.equalsIgnoreCase("low")) {
            return "1. Taco Bell\n2. Chipotle\n3. El Barrio";
        } else if (budget.equalsIgnoreCase("medium")) {
            return "1. El Barrio\n2. Moe's Southwest Grill\n3. Los Arcos";
        } else if (budget.equalsIgnoreCase("high")) {
            return "1. La Paz\n2. Cocina Superior\n3. Sol Y Luna";
        } else {
            return "No options found for the given budget.";
        }
    }

    // Method to suggest Italian restaurants based on budget
    public static String getItalianRestaurant(String budget) {
        if (budget.equalsIgnoreCase("low")) {
            return "1. Olive Garden\n2. Ranelli's\n3. Sanpeggio's";
        } else if (budget.equalsIgnoreCase("medium")) {
            return "1. Carrabba's Italian Grill\n2. Johnny Brusco's New York Style Pizza\n3. Little Italy";
        } else if (budget.equalsIgnoreCase("high")) {
            return "1. Gianmarco's Restaurant\n2. Bottega Cafe\n3. Brio Tuscan Grille";
        } else {
            return "No options found for the given budget.";
        }
    }

    // Method to suggest Fast Food restaurants based on budget
    public static String getFastFoodRestaurant(String budget) {
        if (budget.equalsIgnoreCase("low")) {
            return "1. McDonald's\n2. Cookout\n3. Wendy's";
        } else if (budget.equalsIgnoreCase("medium")) {
            return "1. Chick-fil-A\n2. Tazikis\n3. Cicken Salad Chic";
        } else if (budget.equalsIgnoreCase("high")) {
            return "1. Shake Shack\n2. Mooyah\n3. Five Guys";
        } else {
            return "No options found for the given budget.";
        }
    }

    // Method to suggest BBQ restaurants based on budget
    public static String getBBQRestaurant(String budget) {
        if (budget.equalsIgnoreCase("low")) {
            return "1. Dreamland BBQ\n2. Jim 'N Nick's Bar-B-Q\n3. Full Moon BBQ";
        } else if (budget.equalsIgnoreCase("medium")) {
            return "1. Saw's BBQ\n2. Moe's Original Bar B Que\n3. Rib-It-Up";
        } else if (budget.equalsIgnoreCase("high")) {
            return "1. Rodney Scott's Whole Hog BBQ\n2. Martin's Bar-B-Que Joint\n3. Archibald's BBQ";
        } else {
            return "No options found for the given budget.";
        }
    }

    // Method to suggest Breakfast restaurants based on budget
    public static String getBreakfastRestaurant(String budget) {
        if (budget.equalsIgnoreCase("low")) {
            return "1. Waffle House\n2. IHOP\n3. McDonald's (breakfast menu)";
        } else if (budget.equalsIgnoreCase("medium")) {
            return "1. Cracker Barrel Old Country Store\n2. First Watch\n3. Another Broken Egg Cafe";
        } else if (budget.equalsIgnoreCase("high")) {
            return "1. Another Broken Egg Cafe\n2. Big Bad Breakfast\n3. Highland Gourmet Scones";
        } else {
            return "No options found for the given budget.";
        }
    }

    // Method to suggest Sandwiches restaurants based on budget
    public static String getSandwichesRestaurant(String budget) {
        if (budget.equalsIgnoreCase("low")) {
            return "1. Subway\n2. Jersey Mike's Subs\n3. Firehouse Subs";
        } else if (budget.equalsIgnoreCase("medium")) {
            return "1. Jimmy John's\n2. Panera Bread\n3. Jason's Deli";
        } else if (budget.equalsIgnoreCase("high")) {
            return "1. McAlister's Deli\n2. Which Wich Superior Sandwiches\n3. Potbelly Sandwich Shop";
        } else {
            return "No options found for the given budget.";
        }
    }
}
