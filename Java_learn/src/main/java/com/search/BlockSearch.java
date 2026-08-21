package com.search;

public class BlockSearch {
    public static void main(String[] args) {
        int[] arr = {16, 5, 9, 12, 21, 18,
                32, 23, 37, 26, 45, 34,
                50, 48, 61, 52, 73, 66};
        int number = 9;

        //将数组进行分块，块的数量尽量接近元素的根号数量
        Block block1 = new Block(21, 0, 5);
        Block block2 = new Block(45, 6, 11);
        Block block3 = new Block(73, 12, 17);
        Block[] blocks = {block1, block2, block3};

        int index = findIndex(blocks, number, arr);
        System.out.println(index);
    }

    private static int findIndex(Block[] blocks, int number, int[] arr) {
        //首先找到元素所在的块
        int blockIndex = findBlock(blocks, number);

        if (blockIndex == -1) {
            return -1;
        }
        for (int i = blocks[blockIndex].getStart(); i < blocks[blockIndex].getEnd(); i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;

    }

    private static int findBlock(Block[] blocks, int number) {

        for (int i = 0; i < blocks.length; i++) {
            if (number < blocks[i].getMax()) {
                return i;
            }
        }
        return -1;
    }
}

class Block {
    private int max;
    private int start;
    private int end;


    public Block() {
    }

    public Block(int max, int start, int end) {
        this.max = max;
        this.start = start;
        this.end = end;
    }

    /**
     * 获取
     *
     * @return max
     */
    public int getMax() {
        return max;
    }

    /**
     * 设置
     *
     * @param max
     */
    public void setMax(int max) {
        this.max = max;
    }

    /**
     * 获取
     *
     * @return start
     */
    public int getStart() {
        return start;
    }

    /**
     * 设置
     *
     * @param start
     */
    public void setStart(int start) {
        this.start = start;
    }

    /**
     * 获取
     *
     * @return end
     */
    public int getEnd() {
        return end;
    }

    /**
     * 设置
     *
     * @param end
     */
    public void setEnd(int end) {
        this.end = end;
    }

    public String toString() {
        return "Block{max = " + max + ", start = " + start + ", end = " + end + "}";
    }
}
