package math;

import io.anuke.arc.collection.Array;
import io.anuke.arc.math.geom.Bezier;
import io.anuke.arc.math.geom.Vector2;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.ArrayList;
import java.util.Collection;

@RunWith(Parameterized.class)
public class BezierTest{

    private static float epsilon = Float.MIN_NORMAL;
    private static float epsilonApprimations = 1e-6f;
    @Parameter(0)
    public ImportType type;
    /** use constructor or setter */
    @Parameter(1)
    public boolean useSetter;
    private Bezier<Vector2> bezier;

    @Parameters(name = "use setter {0} imported type {1}")
    public static Collection<Object[]> parameters(){
        Collection<Object[]> parameters = new ArrayList<>();
        for(ImportType type : ImportType.values()){
            parameters.add(new Object[]{type, true});
            parameters.add(new Object[]{type, false});
        }
        return parameters;
    }

    @Before
    public void setup(){
        bezier = null;
    }

    protected Vector2[] create(Vector2[] points){
        if(useSetter){
            bezier = new Bezier<>();
            if(type == ImportType.LibGDXArrays){
                bezier.set(new Array<>(points), 0, points.length);
            }else if(type == ImportType.JavaArrays){
                bezier.set(points, 0, points.length);
            }else{
                bezier.set(points);
            }
        }else{
            if(type == ImportType.LibGDXArrays){
                bezier = new Bezier<>(new Array<>(points), 0, points.length);
            }else if(type == ImportType.JavaArrays){
                bezier = new Bezier<>(points, 0, points.length);
            }else{
                bezier = new Bezier<>(points);
            }

        }
        return points;
    }

    @Test
    public void testLinear2D(){
        Vector2[] points = create(new Vector2[]{new Vector2(0, 0), new Vector2(1, 1)});

        float len = bezier.approxLength(2);
        Assert.assertEquals(Math.sqrt(2), len, epsilonApprimations);

        Vector2 d = bezier.derivativeAt(new Vector2(), 0.5f);
        Assert.assertEquals(1, d.x, epsilon);
        Assert.assertEquals(1, d.y, epsilon);

        Vector2 v = bezier.valueAt(new Vector2(), 0.5f);
        Assert.assertEquals(0.5f, v.x, epsilon);
        Assert.assertEquals(0.5f, v.y, epsilon);

        float t = bezier.approximate(new Vector2(.5f, .5f));
        Assert.assertEquals(.5f, t, epsilonApprimations);

        float l = bezier.locate(new Vector2(.5f, .5f));
        Assert.assertEquals(.5f, t, epsilon);
    }

    private enum ImportType{
        LibGDXArrays, JavaArrays, JavaVarArgs
    }
}
