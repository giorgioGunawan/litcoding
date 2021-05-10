class Solution(object):
    def setZeroes(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: None Do not return anything, modify matrix in-place instead.
        """
        rowIn = []
        colIn = []
        for r in range(len(matrix)):
            for c in range(len(matrix[r])):
                if matrix[r][c] == 0:
                    rowIn.append(r)
                    colIn.append(c)
                    
        for r in range(len(matrix)):
            for c in range(len(matrix[r])):
                if r in rowIn or c in colIn:
                    matrix[r][c] = 0
        return matrix
        
