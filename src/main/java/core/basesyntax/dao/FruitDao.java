package core.basesyntax.dao;

import core.basesyntax.models.Fruit;
import core.basesyntax.models.FruitRecord;
import java.util.Set;

public interface FruitDao {
    void put(FruitRecord fruitRecord);

    void save(FruitRecord fruitRecord);

    Set<Fruit> get();
}