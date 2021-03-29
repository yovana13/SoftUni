number_of_snowballs = int(input())
i=1
snowball_snow_max = None
snowball_time_max = None
snowball_quality_max = None
biggest_value = -99999999999999

for ball in range(1,number_of_snowballs+1):
    snowball_snow = int(input())
    snowball_time = int(input())
    snowball_quality = int(input())
    snowball_value = pow((snowball_snow / snowball_time), snowball_quality)
    if snowball_value>biggest_value:
        biggest_value=snowball_value
        snowball_snow_max=snowball_snow
        snowball_quality_max=snowball_quality
        snowball_time_max= snowball_time

print(f"{snowball_snow_max} : {snowball_time_max} = {biggest_value:.0f} ({snowball_quality_max})")

