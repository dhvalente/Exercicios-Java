package Lista_06.ControleDeTrafego;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum GrauDePerigo {
    BAIXO("0", "Baixo"),
    MEDIO("1", "Medio"),
    ALTO("2", "Alto");


    public String key;
    public String description;

    public String getKey() {
        return key;
    }

    public String getDescription() {
        return description;
    }

    GrauDePerigo(String key, String description) {
        this.key = key;
        this.description = description;
    }

    private static final Map<String, GrauDePerigo> Lookup = new HashMap<String, GrauDePerigo>();

    static {
        for (GrauDePerigo keyValue : EnumSet.allOf(GrauDePerigo.class))
            Lookup.put(keyValue.getKey(), keyValue);
    }

    public static GrauDePerigo get(String key) {
        return Lookup.get(key);
    }

    public static GrauDePerigo getByDescription(String description) {
        for (GrauDePerigo keyValue : EnumSet.allOf(GrauDePerigo.class)) {
            if (keyValue.getDescription().equals(description))
                return keyValue;
        }
        return null;
    }
}
