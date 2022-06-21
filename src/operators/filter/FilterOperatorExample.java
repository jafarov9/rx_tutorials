package operators.filter;

import io.reactivex.Observable;


@SuppressWarnings("ALL")
public class FilterOperatorExample {
    public static void main(String[] args) {
        Observable<String> cars =
                Observable.fromArray("Audi", "BMW", "Bentley", "Porsche");

        Observable<String> carsStartWithB = cars.filter( name -> name.startsWith("B"));
        carsStartWithB.subscribe(
                next -> {
                    System.out.println(next);
                },
                error -> {
                    System.out.println("Error: " + error.getMessage());
                }
        );

    }
}
