// Exceptions
// MemoryFullException
// DuplicateValueException

// rc
// MEMORY_FULL since it is array
// DUPLICATE_VALUE Since there are no duplicates

// ADT - The first parameter is the container, static methods on the Class
// ADO - The methods are on the object
public class ContinuousSortedArrayNoDuplicatesGenericAdtWithExceptions {

    // Constants
    public static int MAX_NUMBER_OF_ITEMS = 10;

    // Exceptions
    static class MemoryFullException extends Exception {}
    static class DuplicateValueException extends Exception {}
    static class DoNotExist extends Exception {}

    // Return Code (rc)
    //public static int MEMORY_FULL = -1;

    class Container {
        public Container() {
            this.count = 0;
        }
        private int count;
        private int[] values;
    }

    // Setters & Getters
    public static int getMaxNumberOfItems() {
        return MAX_NUMBER_OF_ITEMS;
    }

    // O(1)
    public static void init(Container container) {
        container.count = 0;
        container.values = new int[MAX_NUMBER_OF_ITEMS];
    }
    private static int find_index(Container container, int data) {
        return 0;
    }
    private static void push_values(Container container, int index) {

    }
    // If not using Exceptions should return int
    // If using Exceptions should return void
    public static void insert(Container container, int data)
            throws MemoryFullException, DuplicateValueException {
        int index = find_index(container, data);
        push_values(container, index);
        container.values[index] = data;
        container.count++;

        throw new MemoryFullException();
        //return MEMORY_FULL;
    }

    public static void delete(Container container, int data) {

    }

    public boolean isEmpty() {
        return false;
    }

    boolean exist(int data) {
        return true;
    }
}
