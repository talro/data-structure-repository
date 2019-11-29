import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContinuousSortedArrayNoDuplicatesNotGenericWithExceptionsTest {

    ContinuousSortedArrayNoDuplicatesNotGenericWithExceptions.Container myContainerAdt1;
    ContinuousSortedArrayNoDuplicatesNotGenericWithExceptions.Container myContainerAdt2;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }


    @Test
    void init() {
        ContinuousSortedArrayNoDuplicatesNotGenericWithExceptions.init(myContainerAdt1);
    }

    @Test
    void insert() {
        ContinuousSortedArrayNoDuplicatesNotGenericWithExceptions.init(myContainerAdt1);
        ContinuousSortedArrayNoDuplicatesNotGenericWithExceptions.init(myContainerAdt2);
        ContinuousSortedArrayNoDuplicatesNotGenericWithExceptions.insert(myContainerAdt1, 5);
        ContinuousSortedArrayNoDuplicatesNotGenericWithExceptions.insert(myContainerAdt2, 7);
    }
}