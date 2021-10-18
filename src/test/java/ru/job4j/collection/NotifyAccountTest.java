package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class NotifyAccountTest {

    @Test
    public void sent() {
        List<Account> accounts = Arrays.asList(
                new Account("123", "Petr Arsentev", "eDer3432f"),
                new Account("142", "Petr Arsentev", "000001")
        );
        HashSet<Account> expect = new HashSet<>(
                Arrays.asList(
                        new Account("123", "Petr Arsentev", "eDer3432f"),
                        new Account("142", "Petr Arsentev", "000001")
                )
        );
        assertThat(NotifyAccount.sent(accounts), is(expect));
    }

    @Test
    public void sent2() {
        List<Account> accounts = Arrays.asList(
                new Account("345", "Alex Sapsay", "0007-0007"),
                new Account("345", "Alex Sapsay", "0007-0007"),
                new Account("3453", "Alex Sapsay", "0007-0007"),
                new Account("3453", "Alex Sapsay", "0007-0007"),
                new Account("0000", "Alex Sapsay", "6666-6666"),
                new Account("0000", "Alex Sapsay", "9999-99999")
        );

        HashSet<Account> expect = new HashSet<>(Arrays.asList(
                new Account("345", "Alex Sapsay", "0007-0007"),
                new Account("3453", "Alex Sapsay", "0007-0007"),
                new Account("0000", "Alex Sapsay", "6666-6666")

        ));
        assertThat(NotifyAccount.sent(accounts), is(expect));
    }

    @Test
    public void sent3() {
        List<Account> accounts = Arrays.asList(
                new Account("1111", "Alex Sapsay", "0007-0007"),
                new Account("1112", "Alex Sapsay", "0007-0007")
        );

        HashSet<Account> expect = new HashSet<>(Arrays.asList(
                new Account("1111", "Alex Sapsay", "0007-0007"),
                new Account("1112", "Vasily Pupkin", "9999-6666")
        ));
        assertThat(NotifyAccount.sent(accounts), is(expect));
    }

    @Test
    public void sent4() {
        List<Account> accounts = Arrays.asList(
                new Account("1111", "Alex Sapsay", "0007-0007"),
                new Account("1111", "Ivan Susanin", "7000-70000")
        );

        HashSet<Account> expect = new HashSet<>(Arrays.asList(
                new Account("1111", "Alex Sapsay", "0007-0007"),
                new Account("1111", "Ivan Susanin", "7000-70000")
        ));
        assertThat(NotifyAccount.sent(accounts), is(expect));
    }

    @Test
    public void sent5() {
        List<Account> accounts = Arrays.asList(
                new Account("1111", "Alex Sapsay", "0007-0007"),
                new Account("1111", "Ivan Susanin", "7000-70000")
        );

        HashSet<Account> expect = new HashSet<>(Arrays.asList(
                new Account("1111", "Ivan Susanin", "7000-70000")));
        assertThat(NotifyAccount.sent(accounts), is(expect));
    }
}


