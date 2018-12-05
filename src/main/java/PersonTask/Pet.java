package PersonTask;

public enum Pet {
    Cat, Dog, Perrot, Fish, Hamster;

    public static boolean contains(String test) {
        for (Pet c : Pet.values()) {
            if (c.name().equals(test)) {
                return true;
            }
        }
        return false;
    }
}
