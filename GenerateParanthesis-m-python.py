class TreeNode:
    def __init__(self, val='_', left=None, right=None, end=False):
        self.val = val
        self.left = left
        self.right = right
        self.end = end
    

class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        
        root = TreeNode()
        root.val = '('
        returnSet = set()
        self.generateTree(n, root, n-1, n)
        self.traverseTreeBacktrack(n, root, [], returnSet)
        return list(returnSet)
        
    def traverseTreeBacktrack(self, n, root, path, returnSet):
        if root == None:
            if len(path) == n * 2:
                val = "".join(path)
                returnSet.add(val)
            return
        else:
            path = path + [root.val]
            self.traverseTreeBacktrack(n, root.left, path, returnSet)
            self.traverseTreeBacktrack(n, root.right, path, returnSet)

    
    def generateTree(self, n, root, openNum, closeNum):
        # if validity 0 or negative, means there are equal or more closing than opening
        
        if openNum== 0 and closeNum == 0:
            return
        elif openNum < closeNum:
            if openNum > 0:
                root.left = TreeNode('(')
            if closeNum > 0:
                root.right = TreeNode(')')
        else:
            if openNum > 0:
                root.left = TreeNode('(')
        if root.left != None:
            self.generateTree(n, root.left, openNum-1, closeNum)
        if root.right != None:
            self.generateTree(n, root.right, openNum, closeNum-1)
        
        
        
        
