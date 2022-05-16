class MyHashMap {
    int data[]=new int[(int)Math.pow(10,6)+1];
    public MyHashMap() {
        for(int i=0;i<data.length;i++){
            data[i]=-1;
        }
    }
    
    public void put(int key, int value) {
         data[key]=value;
    }
    
    public int get(int key) {
            return data[key];
    }
    
    public void remove(int key) {
       data[key]=-1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */