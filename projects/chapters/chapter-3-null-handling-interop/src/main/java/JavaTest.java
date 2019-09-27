import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class JavaTest {
    String platform;

    @Nullable
    String nullable;

    @NotNull
    String notNull;

    public JavaTest(@Nullable String nullable, @NotNull String notNull) {
        this.nullable = nullable;
        this.notNull = notNull;
    }

    @NotNull
    String getData() {
        return null;
    }
}
