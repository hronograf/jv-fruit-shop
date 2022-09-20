package core.basesyntax.fruitentry;

import java.util.List;
import java.util.Optional;

public interface FruitEntryRepository {

    void save(FruitEntry fruitEntry);
    Optional<FruitEntry> getByFruitName(String fruitName);
    void update(FruitEntry fruitEntry);
    List<FruitEntry> getAll();
}
