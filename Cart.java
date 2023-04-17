Cart cart = Cart.getInstance("1");

cart.getId();
cart.useGetId();

Gson gson = new Gson();

System.out.println(gson.toJson(cart));

private final String id;

private Cart(String id) {
    this             .id = id;
}

public static getInstance(String id) {
    return new Cart(id);
}

public String getId() {
    return this.id;
}

public String useGetId() {
    this.getId();
}

@Override
public String toString() {
    return new Gson().toJson(this);
}