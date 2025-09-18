package seedu.address.model.person;

import static java.util.Objects.requireNonNull;

public class Remark {
    public final String value;
    public Remark(String value) { requireNonNull(value); this.value = value; }
    @Override public String toString() { return value; }
    @Override public boolean equals(Object o) {
        return o == this || (o instanceof Remark && value.equals(((Remark) o).value));
    }
    @Override public int hashCode() { return value.hashCode(); }
}
