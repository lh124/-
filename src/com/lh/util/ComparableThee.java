package com.lh.util;
//������
public class ComparableThee<T extends Comparable<T>>{
	private class Node{
		private T data;
		private Node rigth;
		private Node life;
		public Node(T data) {
			this.data=data;
		}
		public void addNode(Node newNode) {
			Comparable<T> com=newNode.data;

			if(com.compareTo(this.data)<0) {
				if(this.life==null) {
					this.life=newNode;
				}else {
					this.life.addNode(newNode);
				}

			}else {
				if(this.rigth==null) {
					this.rigth=newNode;
				}else {
					this.rigth.addNode(newNode);
				}
			}
		}
		public void toArrayNode() {
			
			if(this.life!=null) {
				this.life.toArrayNode();
			}
			ComparableThee.this.retData[ComparableThee.this.foot++]=this.data;
			
			if(this.rigth!=null) {
				this.rigth.toArrayNode();
			}
		}
	}

	//==================================

	private Node root;
	private int count=0;
	private int foot=0;
	private Object retData[];

	public void add(T data) {
		if(!(data instanceof Comparable)) {
			return ;
		}
		Node newNode=new Node(data);
		if(this.root==null) {
			this.root=newNode;
		}else {
			this.root.addNode(newNode);
		}
		this.count++;
	}

	public int size() {
		return this.count;
	}

	public Object[] toArray() {
		if(this.count==0) {
			return null;
		}else {
			this.foot=0;
			this.retData=new Object[this.count];
			this.root.toArrayNode();
			return retData;
		}
	}
}
