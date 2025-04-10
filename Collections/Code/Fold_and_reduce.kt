  Return the set of products that were ordered by all customers
fun Shop.getProductsOrderedByAll() SetProduct =
    customers.map(CustomergetOrderedProducts).reduce { orderedByAll, customer -
        orderedByAll.intersect(customer)
    };

fun Customer.getOrderedProducts() SetProduct =
    orders.flatMap(Orderproducts).toSet();
