package com.compositePatternPizza;

public class MenuTestDrive {
    public static void main(String args[]) {
        MenuComponent modinosPizzaMenu =
                new Menu("Modino's Pizza", "All your favourite pizzas!");
        MenuComponent lighterPizzaMenu =
                new Menu("Lighter Pizzas", "less than 650kcal per small pizza!");
        MenuComponent sidesMenu =
                new Menu("Modino's Sides", "Side dishes");
        MenuComponent dessertMenu =
                new Menu("Modino's Desserts", "Sweet Treats");
        MenuComponent drinksMenu =
                new Menu("Modino's Drinks", "Quench that thirst!");

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");

        allMenus.add(modinosPizzaMenu);
        allMenus.add(sidesMenu);
        allMenus.add(dessertMenu);
        allMenus.add(drinksMenu);

        modinosPizzaMenu.add(new MenuItem(
                "Pepperoni",
                "Classic tomato sauce, mozzarella and quality pepperoni",
                false,
                12.99));
        modinosPizzaMenu.add(new MenuItem(
                "Margherita Lite",
                "Classic tomato sauce and mozzarella",
                true,
                12.99));
        modinosPizzaMenu.add(lighterPizzaMenu);
        lighterPizzaMenu.add(new MenuItem(
                "Margherita Lite",
                "Classic tomato sauce and low cal mozzarella",
                false,
                12.99));

        sidesMenu.add(new MenuItem(
                "Garlic bread",
                "Garlic flatbread with a sprinkling of herb",
                true,
                2.99));
        sidesMenu.add(new MenuItem(
                "Garlic Dip",
                "Garlic dip for your pizza crusts, yum!",
                false,
                1.99));

        dessertMenu.add(new MenuItem(
                "Jen and Berries Cookie Dough Ice Cream",
                "Vanilla icecream with cookie dough mixed through",
                false,
                4.99));
        dessertMenu.add(new MenuItem(
                "Chocolate Pizza",
                "Why does this exist?",
                true,
                5.99));
        dessertMenu.add(new MenuItem(
                "Sorbet",
                "A scoop of raspberry and a scoop of lime",
                true,
                1.89));

        drinksMenu.add(new MenuItem(
                "Can of Cola",
                "330ml can",
                true,
                1.99));
        drinksMenu.add(new MenuItem(
                "Bottle of Cola",
                "1.5L bottle",
                true,
                3.99));

        Display display = new Display(allMenus);

        display.printMenu();
    }
}
