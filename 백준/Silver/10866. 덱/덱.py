from collections import deque
import sys

class Deque:
    def main(self):
        n = int(sys.stdin.readline().rstrip())
        box = deque()
        for _ in range(n):
            command = sys.stdin.readline().rstrip().split()
            if command[0] == 'push_front':
                box.appendleft(int(command[1]))
            elif command[0] == 'push_back':
                box.append(int(command[1]))
            elif command[0] == 'pop_front':
                print(box.popleft() if box else -1)
            elif command[0] == 'pop_back':
                print(box.pop() if box else -1)
            elif command[0] == 'size':
                print(len(box))
            elif command[0] == 'empty':
                print(int(not box))
            elif command[0] == 'front':
                print(box[0] if box else -1)
            elif command[0] == 'back':
                print(box[-1] if box else -1)

if __name__ == "__main__":
    new = Deque()
    new.main()