import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//DONE
public class compare {

    public static void main(String[] args) {
        //CREATING NON REPEATING INTEGERS
        // 10.000 - 20.000 - 40.000 - 80.000

        Integer[] array100 = new Integer[100];
        for (int i = 0; i < array100.length; i++) {
            array100[i] = i;
        }
        Collections.shuffle(Arrays.asList(array100));

        Integer[] array10 = new Integer[10000];
        for (int i = 0; i < array10.length; i++) {
            array10[i] = i;
        }
        Collections.shuffle(Arrays.asList(array10));
        //System.out.println(Arrays.toString(array10));

        Integer[] array20 = new Integer[20000];
        for (int i = 0; i < array20.length; i++) {
            array20[i] = i;
        }
        Collections.shuffle(Arrays.asList(array20));
        //System.out.println(Arrays.toString(array20));

        Integer[] array40 = new Integer[40000];
        for (int i = 0; i < array40.length; i++) {
            array40[i] = i;
        }
        Collections.shuffle(Arrays.asList(array40));
        //System.out.println(Arrays.toString(array40));

        Integer[] array80 = new Integer[80000];
        for (int i = 0; i < array80.length; i++) {
            array80[i] = i;
        }
        Collections.shuffle(Arrays.asList(array80));
        //System.out.println(Arrays.toString(array80));


        //stores average running times
        SkipList<String,Integer> average = new SkipList<>();


        //Binary Search Tree
        BinarySearchTree<Integer>[] binarySearchTrees = new BinarySearchTree[10];
        int total = 0;
        for (int i = 0; i < 10 ; i++) {
            binarySearchTrees[i] = new BinarySearchTree<>();
        }

        for (int i = 0; i < binarySearchTrees.length ; i++){
            for (int j = 0; j < array10.length; j++) {
                binarySearchTrees[i].add(j);
            }

            Collections.shuffle(Arrays.asList(array100));
            long startTime = System.nanoTime();
            for (int j = 0; j < array100.length; j++) {
                binarySearchTrees[i].add(j);
            }
            long stopTime = System.nanoTime();
            System.out.println("Binary Search Tree - 100 - Running Time :" + (stopTime - startTime)  + " nanosecond" );
            total += (stopTime-startTime);
        }
        average.add("bst1", total/100);
        total = 0;


       //RED-BLACK TREE PERFORMANCE
        RedBlackTree<Integer>[] redBlackTree = new RedBlackTree[40];
        for (int i = 0; i < 40 ; i++) {
            redBlackTree[i] = new RedBlackTree<Integer>();
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < array10.length ; j++) {
                redBlackTree[i].add(j);
            }

            Collections.shuffle(Arrays.asList(array100));
            long startTime = System.nanoTime();
            for (int j = 0; j < array100.length; j++) {
                redBlackTree[i].add(j);
            }
            long stopTime = System.nanoTime();
            System.out.println("Red Black Tree - 100 - Running Time :" + (stopTime - startTime)  + " nanosecond" );
            total += (stopTime-startTime);
        }
        average.add("rbt1", total/100);
        total = 0;
        System.out.println("\n");

        for (int i = 10; i < 20; i++) {

            for (int j = 0; j < array20.length ; j++) {
                redBlackTree[i].add(j);
            }

            Collections.shuffle(Arrays.asList(array100));
            long startTime = System.nanoTime();
            for (int j = 0; j < array100.length; j++) {
                redBlackTree[i].add(j);
            }
            long stopTime = System.nanoTime();
            System.out.println("Red Black Tree - 100 - Running Time :" + (stopTime - startTime)  + " nanosecond" );
            total += (stopTime-startTime);
        }
        average.add("rbt2", total/100);
        total = 0;
        System.out.println("\n");


        for (int i = 20; i < 30; i++) {
            for (int j = 0; j < array40.length ; j++) {
                redBlackTree[i].add(j);
            }
            Collections.shuffle(Arrays.asList(array100));
            long startTime = System.nanoTime();
            for (int j = 0; j < array100.length; j++) {
                redBlackTree[i].add(j);
            }
            long stopTime = System.nanoTime();
            System.out.println("Red Black Tree - 100 - Running Time :" + (stopTime - startTime)  + " nanosecond" );
            total += (stopTime-startTime);
        }
        average.add("rbt4", total/100);
        total = 0;
        System.out.println("\n");

        for (int i = 30; i < 40; i++) {
            for (int j = 0; j < array80.length ; j++) {
                redBlackTree[i].add(j);
            }
            Collections.shuffle(Arrays.asList(array100));
            long startTime = System.nanoTime();
            for (int j = 0; j < array100.length; j++) {
                redBlackTree[i].add(j);
            }
            long stopTime = System.nanoTime();
            System.out.println("Red Black Tree - 100 - Running Time :" + (stopTime - startTime)  + " nanosecond" );
            total += (stopTime-startTime);
        }
        average.add("rbt8", total/100);
        total = 0;
        System.out.println("\n");


        //AVL TREE PERFORMANCE
        TwoThreeFourTree<Integer>[] twoThreeFourTrees = new TwoThreeFourTree[40];
        for (int i = 0; i < 40 ; i++) {
            twoThreeFourTrees[i] = new TwoThreeFourTree<>();
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < array10.length ; j++) {
                twoThreeFourTrees[i].add(j);
            }
            Collections.shuffle(Arrays.asList(array100));
            long startTime = System.nanoTime();
            for (int j = 0; j < array100.length; j++) {
                twoThreeFourTrees[i].add(j);
            }
            long stopTime = System.nanoTime();
            System.out.println("2-3 Tree - 100 - Running Time :" + (stopTime - startTime)  + " nanosecond" );
            total += (stopTime-startTime);
        }
        average.add("23t1", total/100);
        total = 0;
        System.out.println("\n");

        for (int i = 10; i < 20; i++) {
            for (int j = 0; j < array20.length ; j++) {
                twoThreeFourTrees[i].add(j);
            }
            Collections.shuffle(Arrays.asList(array100));
            long startTime = System.nanoTime();
            for (int j = 0; j < array100.length; j++) {
                twoThreeFourTrees[i].add(j);
            }
            long stopTime = System.nanoTime();
            System.out.println("2-3 Tree - 100 - Running Time :" + (stopTime - startTime)  + " nanosecond" );
            total += (stopTime-startTime);
        }
        average.add("23t2", total/100);
        total = 0;
        System.out.println("\n");

        for (int i = 20; i < 30; i++) {
            for (int j = 0; j < array40.length ; j++) {
                twoThreeFourTrees[i].add(j);
            }
            Collections.shuffle(Arrays.asList(array100));
            long startTime = System.nanoTime();
            for (int j = 0; j < array100.length; j++) {
                twoThreeFourTrees[i].add(j);
            }
            long stopTime = System.nanoTime();
            System.out.println("2-3 Tree - 100 - Running Time :" + (stopTime - startTime)  + " nanosecond" );
            total += (stopTime-startTime);
        }
        average.add("23t4", total/100);
        total = 0;
        System.out.println("\n");

        for (int i = 30; i < 40; i++) {
            for (int j = 0; j < array80.length ; j++) {
                twoThreeFourTrees[i].add(j);
            }
            Collections.shuffle(Arrays.asList(array100));
            long startTime = System.nanoTime();
            for (int j = 0; j < array100.length; j++) {
                twoThreeFourTrees[i].add(j);
            }
            long stopTime = System.nanoTime();
            System.out.println("2-3 Tree - 100 - Running Time :" + (stopTime - startTime)  + " nanosecond" );
            total += (stopTime-startTime);
        }
        average.add("23t8", total/100);
        total = 0;
        System.out.println("\n");

        //B TREE PERFORMANCE
        BTree<Integer,Integer>[] bTree = new BTree[40];
        for (int i = 0; i < 40; i++) {
            bTree[i] = new BTree<>();
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < array10.length ; j++) {
                bTree[i].put(i,i);
            }
            Collections.shuffle(Arrays.asList(array100));
            long startTime = System.nanoTime();
            for (int j = 0; j < array100.length; j++) {
                bTree[i].put(j,j);
            }
            long stopTime = System.nanoTime();
            System.out.println("B Tree - 100 - Running Time :" + (stopTime - startTime)  + " nanosecond" );
            total += (stopTime-startTime);
        }
        average.add("bt1", total/100);
        total = 0;
        System.out.println("\n");

        for (int i = 10; i < 20; i++) {
            for (int j = 0; j < array20.length ; j++) {
                bTree[i].put(i,i);
            }
            Collections.shuffle(Arrays.asList(array100));
            long startTime = System.nanoTime();
            for (int j = 0; j < array100.length; j++) {
                bTree[i].put(j,j);
            }
            long stopTime = System.nanoTime();
            System.out.println("B Tree - 100 - Running Time :" + (stopTime - startTime)  + " nanosecond");
            total += (stopTime-startTime);
        }
        average.add("bt2", total/100);
        total = 0;
        System.out.println("\n");

        for (int i = 20; i < 30; i++) {
            for (int j = 0; j < array40.length ; j++) {
                bTree[i].put(i,i);
            }
            Collections.shuffle(Arrays.asList(array100));
            long startTime = System.nanoTime();
            for (int j = 0; j < array100.length; j++) {
                bTree[i].put(j,j);
            }
            long stopTime = System.nanoTime();
            System.out.println("B Tree - 100 - Running Time :" + (stopTime - startTime)  + " nanosecond" );
            total += (stopTime-startTime);
        }
        average.add("bt4", total/100);
        total = 0;
        System.out.println("\n");

        for (int i = 30; i < 40; i++) {
            for (int j = 0; j < array80.length ; j++) {
                bTree[i].put(i,i);
            }
            Collections.shuffle(Arrays.asList(array100));
            long startTime = System.nanoTime();
            for (int j = 0; j < array100.length; j++) {
                bTree[i].put(j,j);
            }
            long stopTime = System.nanoTime();
            System.out.println("B Tree - 100 - Running Time :" + (stopTime - startTime) + " nanosecond");
            total += (stopTime-startTime);
        }
        average.add("bt8", total/100);
        total = 0;
        System.out.println("\n");

        // SKIP LIST PERFORMANCE
        SkipList<Integer,Integer>[] skipList = new SkipList[40];
        for (int i = 0; i < 40 ; i++) {
            skipList[i] = new SkipList<>();
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < array10.length ; j++) {
                skipList[i].add(i,i);
            }
            Collections.shuffle(Arrays.asList(array100));
            long startTime = System.nanoTime();
            for (int j = 0; j < array100.length; j++) {
                skipList[i].add(j,j);
            }
            long stopTime = System.nanoTime();
            System.out.println("Skip List - 100 - Running Time :" + (stopTime - startTime)+" nanosecond" );
            total += (stopTime-startTime);
        }
        average.add("sl1", total/100);
        total = 0;
        System.out.println("\n");

        for (int i = 10; i < 20; i++) {
            for (int j = 0; j < array20.length ; j++) {
                skipList[i].add(i,i);
            }
            Collections.shuffle(Arrays.asList(array100));
            long startTime = System.nanoTime();
            for (int j = 0; j < array100.length; j++) {
                skipList[i].add(j,j);
            }
            long stopTime = System.nanoTime();
            System.out.println("Skip List - 100 - Running Time :" + (stopTime - startTime) );
            total += (stopTime-startTime);
        }
        average.add("sl2", total/100);
        total = 0;
        System.out.println("\n");

        for (int i = 20; i < 30; i++) {
            for (int j = 0; j < array40.length ; j++) {
                skipList[i].add(i,i);
            }
            Collections.shuffle(Arrays.asList(array100));
            long startTime = System.nanoTime();
            for (int j = 0; j < array100.length; j++) {
                skipList[i].add(j,j);
            }
            long stopTime = System.nanoTime();
            System.out.println("Skip List - 100 - Running Time :" + (stopTime - startTime)  );
            total += (stopTime-startTime);
        }
        average.add("sl4", total/100);
        total = 0;
        System.out.println("\n");

        for (int i = 30; i < 40; i++) {
            for (int j = 0; j < array80.length ; j++) {
                skipList[i].add(i,i);
            }
            Collections.shuffle(Arrays.asList(array100));
            long startTime = System.nanoTime();
            for (int j = 0; j < array100.length; j++) {
                skipList[i].add(j,j);
            }
            long stopTime = System.nanoTime();
            System.out.println("Skip List - 100 - Running Time :" + (stopTime - startTime) );
            total += (stopTime-startTime);
        }
        average.add("sl8", total/100);
        total = 0;
        System.out.println("\n");

        System.out.println(average.toString());
    }
}
