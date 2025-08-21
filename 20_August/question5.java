class Tree
{
     public ArrayList<Integer> diagonal(Node root)
      {
           //add your code here.
           ArrayList<Integer> result= new ArrayList<>();
           if(root==null){
               return result;
           }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            while(!q.isEmpty()){
                Node currNode = q.poll();
                while(currNode!=null){
                    result.add(currNode.data);
                    if(currNode.left!=null){
                        q.add(currNode.left);
                    }
                    currNode = currNode.right;
                }
            }
            return result;
      }
}