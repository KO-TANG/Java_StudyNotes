//資一A 09156104 朱可棠
package HW07_09156104_1092;

public class StackOfIntegers {
		private int[] elements;
		private int size;
		public static final int DEFAULT_CAPACITY = 16;
		//default constructor的容量是16
		public StackOfIntegers() {
			this(DEFAULT_CAPACITY);
		}
		//specified maximum capacity
		public StackOfIntegers(int capacity) {
			elements = new int[capacity];
		}
		//把新的整數放入stack
		public int push(int value) {
			if(size>=elements.length) {
				int[] temp = new int[elements.length*2]; //如果儲存空間不夠，自動加大陣列長度
				System.arraycopy( elements, 0, temp, 0, elements.length);
				elements = temp;
			}
			return elements[size++] = value;
		}
		//回傳並且移除stack最上面的element
		public int pop() {
			return elements[--size];
		}
		//只有回傳stack最上面的element
		public int peek() {
			return elements[size-1];
		}
		//stack是否為空值
		public boolean empty() {
			return size ==0;
		}
		public int getSize() {
			return size;
		}
		
}
