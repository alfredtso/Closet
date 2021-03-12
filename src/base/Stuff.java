package base;

import java.util.UUID;

public abstract class Stuff {
    final String uuid;
    public Stuff() {
        this.uuid = UUID.randomUUID().toString().replace("-","");
    }

    public abstract String getDescription();
    public String getUuid() {
        return uuid;
    }
}
