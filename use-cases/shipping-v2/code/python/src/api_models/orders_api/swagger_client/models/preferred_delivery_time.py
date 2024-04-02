# coding: utf-8

"""
    Selling Partner API for Orders

    The Selling Partner API for Orders helps you programmatically retrieve order information. These APIs let you develop fast, flexible, custom applications in areas like order synchronization, order research, and demand-based decision support tools. The Orders API only supports orders that are less than two years old. Orders more than two years old will not show in the API response.  # noqa: E501

    OpenAPI spec version: v0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six

from src.api_models.orders_api.swagger_client.configuration import Configuration


class PreferredDeliveryTime(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'business_hours': 'list[BusinessHours]',
        'exception_dates': 'list[ExceptionDates]'
    }

    attribute_map = {
        'business_hours': 'BusinessHours',
        'exception_dates': 'ExceptionDates'
    }

    def __init__(self, business_hours=None, exception_dates=None, _configuration=None):  # noqa: E501
        """PreferredDeliveryTime - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._business_hours = None
        self._exception_dates = None
        self.discriminator = None

        if business_hours is not None:
            self.business_hours = business_hours
        if exception_dates is not None:
            self.exception_dates = exception_dates

    @property
    def business_hours(self):
        """Gets the business_hours of this PreferredDeliveryTime.  # noqa: E501

        Business hours when the business is open for deliveries.  # noqa: E501

        :return: The business_hours of this PreferredDeliveryTime.  # noqa: E501
        :rtype: list[BusinessHours]
        """
        return self._business_hours

    @business_hours.setter
    def business_hours(self, business_hours):
        """Sets the business_hours of this PreferredDeliveryTime.

        Business hours when the business is open for deliveries.  # noqa: E501

        :param business_hours: The business_hours of this PreferredDeliveryTime.  # noqa: E501
        :type: list[BusinessHours]
        """

        self._business_hours = business_hours

    @property
    def exception_dates(self):
        """Gets the exception_dates of this PreferredDeliveryTime.  # noqa: E501

        Dates when the business is closed in the next 30 days.  # noqa: E501

        :return: The exception_dates of this PreferredDeliveryTime.  # noqa: E501
        :rtype: list[ExceptionDates]
        """
        return self._exception_dates

    @exception_dates.setter
    def exception_dates(self, exception_dates):
        """Sets the exception_dates of this PreferredDeliveryTime.

        Dates when the business is closed in the next 30 days.  # noqa: E501

        :param exception_dates: The exception_dates of this PreferredDeliveryTime.  # noqa: E501
        :type: list[ExceptionDates]
        """

        self._exception_dates = exception_dates

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value
        if issubclass(PreferredDeliveryTime, dict):
            for key, value in self.items():
                result[key] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, PreferredDeliveryTime):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, PreferredDeliveryTime):
            return True

        return self.to_dict() != other.to_dict()
