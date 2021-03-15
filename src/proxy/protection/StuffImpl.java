package proxy.protection;

import java.util.UUID;

public class StuffImpl implements Stuff {

    String description;
    String UUID;

    public StuffImpl() {
        this.UUID = java.util.UUID.randomUUID().toString();
        this.description = "";
    }

    public String getDescription() {
        return description;
    }

    public String getUUID() {
        return UUID;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
