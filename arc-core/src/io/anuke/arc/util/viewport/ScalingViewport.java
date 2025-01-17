package io.anuke.arc.util.viewport;

import io.anuke.arc.graphics.Camera;
import io.anuke.arc.math.geom.Vector2;
import io.anuke.arc.util.Scaling;

/**
 * A viewport that scales the world using {@link Scaling}.
 * <p>
 * {@link Scaling#fit} keeps the aspect ratio by scaling the world up to fit the screen, adding black bars (letterboxing) for the
 * remaining space.
 * <p>
 * {@link Scaling#fill} keeps the aspect ratio by scaling the world up to take the whole screen (some of the world may be off
 * screen).
 * <p>
 * {@link Scaling#stretch} does not keep the aspect ratio, the world is scaled to take the whole screen.
 * <p>
 * {@link Scaling#none} keeps the aspect ratio by using a fixed size world (the world may not fill the screen or some of the world
 * may be off screen).
 * @author Daniel Holderbaum
 * @author Nathan Sweet
 */
public class ScalingViewport extends Viewport{
    private Scaling scaling;

    /** Creates a new viewport using a new {@link Camera}. */
    public ScalingViewport(Scaling scaling, float worldWidth, float worldHeight){
        this(scaling, worldWidth, worldHeight, new Camera());
    }

    public ScalingViewport(Scaling scaling, float worldWidth, float worldHeight, Camera camera){
        this.scaling = scaling;
        setWorldSize(worldWidth, worldHeight);
        setCamera(camera);
    }

    @Override
    public void update(int screenWidth, int screenHeight, boolean centerCamera){
        Vector2 scaled = scaling.apply(getWorldWidth(), getWorldHeight(), screenWidth, screenHeight);
        int viewportWidth = Math.round(scaled.x);
        int viewportHeight = Math.round(scaled.y);

        // Center.
        setScreenBounds((screenWidth - viewportWidth) / 2, (screenHeight - viewportHeight) / 2, viewportWidth, viewportHeight);

        apply(centerCamera);
    }

    public Scaling getScaling(){
        return scaling;
    }

    public void setScaling(Scaling scaling){
        this.scaling = scaling;
    }
}
