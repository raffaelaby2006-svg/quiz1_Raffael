package id.ac.polinema.oop;

/**
 * The cafe menu: holds up to 10 {@link MenuItem} objects.
 *
 * This is an AGGREGATION: the MenuItem objects are created outside
 * and passed in — they can exist without the Menu.
 *
 * Complete every method body below (replace the
 * {@code throw new UnsupportedOperationException(...)} lines).
 * Use a plain array, NOT List/ArrayList.
 *
 * Declare the fields yourself: see the class diagram in the README
 * (all fields must be private).
 */
public class Menu {

    MenuItem[] items;
    int itemCount;

    public Menu(MenuItem item, int itemCount) {
        this.items = items;
        this.itemCount = itemCount;
    }
    public void addMenuItem(MenuItem items) {
        items = items;
    }
    public MenuItem findItem(String name) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public int getItemCount() {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
