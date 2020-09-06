package com.ejpm.smoothies;

import java.util.*;

public class Smoothie {

  private static final String SPLIT_TOKEN = ",";

  private static final int PARSER_PRODUCT_POSITON = 0;
  private static final String PARSER_ALLERGEN_INDICATOR = "-";

  public static String ingredients(String inputOrder) {
    final Order customerOrder = decomposeOrder(inputOrder);
    final List<String> ingredients = getIngredients(customerOrder);
    return formatResponse(ingredients);
  }

  private static Order decomposeOrder(final String inputOrder) {
    if (inputOrder == null || inputOrder.isEmpty()) {
      throw new IllegalArgumentException("Invalid empty order");
    }

    final String[] orderContents = inputOrder.split(SPLIT_TOKEN);

    final String product = orderContents[PARSER_PRODUCT_POSITON];
    final List<String> allergens = parseAllergens(orderContents);

    return new Order(product, allergens);
  }

  private static List<String> parseAllergens(final String[] orderContents) throws IllegalArgumentException {
    final List<String> allergens = new ArrayList<>();
    for (int i = 1; i < orderContents.length; i++) {
      if (!orderContents[i].startsWith(PARSER_ALLERGEN_INDICATOR)) {
        throw new IllegalArgumentException("Invalid input token for allergen: " + orderContents[i]);
      }

      allergens.add(orderContents[i].substring(1));
    }
    return allergens;
  }

  private static List<String> getIngredients(final Order customerOrder) {
    final List<String> productIngredients = new ProductDetailsInquiry().getProductDetailByProductName(customerOrder.getProduct());

    if (productIngredients == null) {
      throw new IllegalArgumentException("Invalid Product " + customerOrder.getProduct() + " -> I don't know how to do that yet");
    }

    return removeAllergens(productIngredients, customerOrder.getAllergens());
  }

  private static List<String> removeAllergens(final List<String> productIngredients, final List<String> allergens) {
    final List<String> finalList = new ArrayList<>();
    for (final String ingredient : productIngredients) {
      if (!allergens.contains(ingredient)) {
        finalList.add(ingredient);
      }
    }
    return finalList;
  }

  private static String formatResponse(List<String> ingredients) {
    Collections.sort(ingredients);
    return String.join(SPLIT_TOKEN, ingredients);
  }

  private static class Order {

    private final String product;
    private final List<String> allergens;

    Order(String product, List<String> allergens) {
      this.product = product;
      this.allergens = allergens;
    }

    public String getProduct() {
      return product;
    }

    public List<String> getAllergens() {
      return allergens;
    }

  }

  private static class ProductDetailsInquiry {

    //Memory DB :) 
    private final Map<String, String[]> ingredients = new HashMap<>();

    ProductDetailsInquiry() {
      ingredients.put("Classic", new String[]{"strawberry", "banana", "pineapple", "mango", "peach", "honey"});
      ingredients.put("Freezie", new String[]{"blackberry", "blueberry", "black currant", "grape juice", "frozen yogurt"});
      ingredients.put("Greenie", new String[]{"green apple", "lime", "avocado", "spinach", "ice", "apple juice"});
      ingredients.put("Just Desserts", new String[]{"banana", "ice cream", "chocolate", "peanut", "cherry"});

    }

    public List<String> getProductDetailByProductName(final String name) {
      final String[] productIngredients = ingredients.get(name);

      if (productIngredients == null) {
        return null;
      }

      return Arrays.asList(productIngredients);
    }
  }

}
