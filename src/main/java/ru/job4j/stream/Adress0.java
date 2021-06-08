package ru.job4j.stream;

public class Adress0 {
    private String city;
    private String street;
    private int home;
    private int apartment;

    public Adress0(String city,
                   String street,
                   int home,
                   int apartment) {
        this.city = city;
        this.street = street;
        this.home = home;
        this.apartment = apartment;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getHome() {
        return home;
    }

    public int getApartment() {
        return apartment;
    }

    @Override
    public String toString() {
        return "Adress{"
                + "city='" + city + '\''
                + ", street='" + street + '\''
                + ", home=" + home
                + ", apartment=" + apartment
                + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Adress0 adress = (Adress0) o;

        if (home != adress.home) {
            return false;
        }
        if (apartment != adress.apartment) {
            return false;
        }
        if (city != null ? !city.equals(adress.city) : adress.city != null) {
            return false;
        }
        return street != null ? street.equals(adress.street) : adress.street == null;
    }

    @Override
    public int hashCode() {
        int result = city != null ? city.hashCode() : 0;
        result = 31 * result + (street != null ? street.hashCode() : 0);
        result = 31 * result + home;
        result = 31 * result + apartment;
        return result;
    }
}