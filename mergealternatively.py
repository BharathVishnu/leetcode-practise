class Solution(object):
    def mergeAlternately(self, word1, word2):
        """
        :type word1: str
        :type word2: str
        :rtype: str
        """

        
        result = ""
        count = 0
        if len(word1) == len(word2):
          for i in range(0,len(word1)):
            result +=  word1[i] + word2[i]
        elif len(word1) > len(word2):
          for i in range(0,len(word2)):
            result += word1[i] + word2[i]
            count = count + 1
          result += word1[count:]
        elif len(word1) < len(word2):
          for i in range(0,len(word1)):
            result += word1[i] + word2[i]
            count = count + 1
          result += word2[count:]

        return result