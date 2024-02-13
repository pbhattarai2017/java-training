import os
import datetime

entries = os.listdir()

most_recent_day = 1
most_recent_date = 20240205

for entry in entries:
    if entry.startswith('day'):
        day, date = entry.split('-')
        recent_day = int(day[3:])
        if recent_day > most_recent_day:
            most_recent_day = recent_day
            most_recent_date = int(date)

# create a directory with day{most_recent_day + 1}
today = int(datetime.datetime.strftime(datetime.datetime.now(), "%Y%m%d"))
#today = 20240214

if most_recent_date == today:
    # cd to directory
    print(f'cd day{most_recent_day}-{most_recent_date}')
else:
    # create a directory and cd
    dirpath = f'day{most_recent_day + 1}-{today}'
    os.mkdir(dirpath)
    print(f'cd {dirpath}')
