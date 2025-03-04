import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;

public class PracticeProblemTest {
   @Test
   @DisplayName("")
   void sumColTest3() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { int[][].class, int.class };
         Method method = testClass.getDeclaredMethod("sumColumn", cArg);
         // Enter code here
         int[][] arr = { { 1, 3, 4, 6 },
               { 3, 5, 7, -2 },
               { 2, 3, 5, -6 },
               { 3, 6, 2, -3 } };
         assertEquals(-5, (int) method.invoke(null, arr, 3));
      }

      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void sumColTest2() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { int[][].class, int.class };
         Method method = testClass.getDeclaredMethod("sumColumn", cArg);
         // Enter code here
         int[][] arr = { { 1, 3, 4, 6 },
               { 3, 5, 7, 2 },
               { 2, 3, 5, 6 } };
         assertEquals(11, (int) method.invoke(null, arr, 1));
      }

      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void sumColTest1() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { int[][].class, int.class };
         Method method = testClass.getDeclaredMethod("sumColumn", cArg);
         // Enter code here
         int[][] arr = { { 0, 3, 4, 6 },
               { 0, 5, 7, 2 },
               { 0, 3, 5, 6 } };
         assertEquals(0, (int) method.invoke(null, arr, 0));
      }

      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void sumRowTest3() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { int[][].class, int.class };
         Method method = testClass.getDeclaredMethod("sumRow", cArg);
         // Enter code here
         int[][] arr = { { 1, 3, 4, 6 },
               { 3, 5, 7, 2 },
               { -2, -3, -5, -6 } };
         assertEquals(-16, (int) method.invoke(null, arr, 2));
      }

      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void sumRowTest2() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { int[][].class, int.class };
         Method method = testClass.getDeclaredMethod("sumRow", cArg);
         // Enter code here
         int[][] arr = { { 1, 3, 4, 6 },
               { 3, 5, 7, 2 },
               { 2, 3, 5, 0 },
               { 0, 0, 0, 0 } };
         assertEquals(0, (int) method.invoke(null, arr, 3));
      }

      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void sumRowTest1() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { int[][].class, int.class };
         Method method = testClass.getDeclaredMethod("sumRow", cArg);
         // Enter code here
         int[][] arr = { { 1, 3, 4, 6 },
               { 3, 5, 7, 2 },
               { 2, 3, 5, 6 } };
         assertEquals(14, (int) method.invoke(null, arr, 0));
      }

      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void sum2DTest3() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { int[][].class };
         Method method = testClass.getDeclaredMethod("sum2D", cArg);
         // Enter code here
          int[][] arr = new int[][]{ { 1, 3, -4, 6 },
               { 3, -34, 7, 2 },
               { 2, 3, -10, 6 } };
         assertEquals(-15, (int) method.invoke(null, new Object[]{arr}));
      }

      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void sum2Dtest2() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { int[][].class };
         Method method = testClass.getDeclaredMethod("sum2D", cArg);
         // Enter code here
         int[][] arr = { { 0, 0, 0, 0 },
               { 0, 0, 0, 0 },
               { 0, 0, 0, 0 } };
         assertEquals(0, (int) method.invoke(null, new Object[]{arr}));
      }

      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void Sum2DTest1() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { int[][].class };
         Method method = testClass.getDeclaredMethod("sum2D", cArg);
         // Enter code here
         int[][] arr = { { 1, 3, 4, 6 },
               { 3, 5, 7, 2 },
               { 2, 3, 5, 6 } };
         assertEquals(47, (int) method.invoke(null, new Object[]{arr}));
      }

      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened");
      }
   }
}
