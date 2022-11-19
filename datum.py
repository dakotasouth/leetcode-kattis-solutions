import datetime
import calendar
day, month = input().split()
print(datetime.datetime(2009,int(month),int(day)).strftime('%A'))