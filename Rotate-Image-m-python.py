class Solution(object):
    def rotate(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: None Do not return anything, modify matrix in-place instead.
        """
        for offset in range(int(math.floor(len(matrix)/2))):
            for i in range(len(matrix) - 1 - offset*2):
                n = i + offset
                m = len(matrix) - n - 1
                x = len(matrix) - 1 - offset
                tmp = matrix[offset][n]
                matrix[offset][n] = matrix[m][offset] # shd be 2,1
                matrix[m][offset] = matrix[x][m] # shd be 2,2
                matrix[x][m] = matrix[n][x] # shd be 1,2
                matrix[n][x] = tmp
                
        
        return matrix
