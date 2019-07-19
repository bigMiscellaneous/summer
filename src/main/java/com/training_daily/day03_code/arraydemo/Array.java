package com.training_daily.day03_code.arraydemo;

public class Array {
    private int size;
    private int[] data;

    /**
     * 定义数组容量
     */
    public Array(int capacity) {
        data = new int[capacity];
    }

    /**
     * 数组默认容量为10
     */
    public Array() {
        this(10);
    }

    /**
     * 求出数组的元素个数
     */
    public int getSize() {
        return size;
    }

    /**
     * 求出数组的长度
     */
    public int getCapacity() {
        return data.length;
    }

    /**
     * 判断数组是否为空
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 添加元素
     */
    public void add(int index, int element) {
        if (size == data.length) {
            throw new IllegalArgumentException("Array is full.");
        }
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Add filed.Require index >= 0 and index <= size.");
        } else {
            for (int i = size - 1; i >= index; i--) {
                data[i + 1] = data[i];
            }
            data[index] = element;
            size++;
        }
    }

    /**
     * 数组首位添加元素
     */
    public void addFirst(int element) {
        add(0, element);
    }

    /**
     * 数组末尾添加元素
     */
    public void addLast(int element) {
        add(size, element);
    }

    /**
     * 重写toString方法
     */
    public String toString() {
        String result = "[";
        for (int i = 0; i < size; i++) {
            if (i == size - 1) {
                result += data[i] + "]";
            } else {
                result += data[i] + ",";
            }
        }
        return result;
    }


    /**
     * 从数组中获取元素
     */
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Get failed.Index is Illegal.");
        }
        return data[index];
    }

    /**
     * 设置指定位置数组的元素
     */
    public void set(int index, int element) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Set failed.index is illegal.");
        }
        data[index] = element;
    }

    /**
     * 查询数组中是否包含指定元素
     */
    public boolean contain(int element) {
        for (int i = 0; i < size; i++) {
            if (data[i] == element) {
                return true;
            }
        }
        return false;
    }

    /**
     * 查找元素的下标
     */
    public int find(int element) {
        for (int i = 0; i < size; i++) {
            if (data[i] == element) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 删除表中的元素
     */
    public int remove(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Delete failed.index is illegal.");
        }
        int element = data[index];
        for (int i = index; i < size; i++) {
            data[i] = data[i + 1];
        }
        size--;
        return element;
    }

    /**
     * 删除数组中最后一位元素
     */
    public int removeLast() {
        return remove(size - 1);
    }

    /**
     *删除数组中的首位元素
     */
    public int removeFirst() {
        return remove(0);
    }

    /**
     *删除指定元素
     * 先同过find方法找到该元素的下标
     */
    public void removeElement(int element) {
        int index = find(element);
        if (index != -1) {
            remove(index);
        }
    }
}
