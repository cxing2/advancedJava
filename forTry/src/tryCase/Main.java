package tryCase;

import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;
public final class Main {

    public static void main(String[] args) {
        UdacisearchClient.Builder clientBuilder = new UdacisearchClient.Builder()//remember parenthsese!!!
                .setName("CatFacts LLC")
                .setId(17)
                .setQuarterlyBudget(8000)
                .setNumEmployees(5)
                .setContractStart(Instant.now())
                .setContractLength(Duration.ofDays(180))
                .setTimeZone(ZoneId.of("America/Los_Angeles"))
                .setBillingAddress("555 Meowmers Ln, Riverside, CA 92501");
        UdacisearchClient client = clientBuilder.build();
        System.out.println(client);
    }
}
