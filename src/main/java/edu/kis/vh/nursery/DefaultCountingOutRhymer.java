package edu.kis.vh.nursery;

/**
 * Domyślna implementacja wyliczanki działająca jak stos.
 * Przechowuje liczby całkowite i zwraca je w odwrotnej kolejności (LIFO).
 */
public class DefaultCountingOutRhymer {

    private int[] NUMBERS = new int[12];

    private int total = -1;

    /**
     * Zwraca indeks ostatnio dodanego elementu.
     *
     * @return aktualny indeks wierzchołka stosu
     */
    public int getTotal() {
        return total;
    }

    /**
     * Dodaje liczbę do wyliczanki, jeśli nie jest pełna.
     *
     * @param in liczba do dodania
     */
    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    /**
     * Sprawdza, czy wyliczanka jest pusta.
     *
     * @return true jeśli wyliczanka jest pusta, false w przeciwnym razie
     */
    public boolean callCheck() {
        return total == -1;
    }

    /**
     * Sprawdza, czy wyliczanka jest pełna.
     *
     * @return true jeśli wyliczanka jest pełna, false w przeciwnym razie
     */
    public boolean isFull() {
        return total == 11;
    }

    /**
     * Zwraca wartość elementu na wierzchołku stosu bez jego usuwania.
     *
     * @return wartość na wierzchołku lub -1 jeśli wyliczanka jest pusta
     */
    protected int peekaboo() {
        if (callCheck())
            return -1;
        return NUMBERS[total];
    }

    /**
     * Pobiera i usuwa element z wierzchołka stosu.
     *
     * @return pobrana wartość lub -1 jeśli wyliczanka jest pusta
     */
    public int countOut() {
        if (callCheck())
            return -1;
        return NUMBERS[total--];
    }

}